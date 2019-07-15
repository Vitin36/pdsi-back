package com.sim.service;

import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.sim.dto.SensorHumidadeCreate;
import com.sim.dto.SensorLuzCreate;
import com.sim.dto.SensorPresencaCreate;
import com.sim.dto.SensorSonoroCreate;
import com.sim.dto.SensorTemperaturaCreate;
import com.sim.exception.NotFoundException;
import com.sim.model.Poste;
import com.sim.model.Sensor;
import com.sim.model.SensorHumidade;
import com.sim.model.SensorLuz;
import com.sim.model.SensorPresenca;
import com.sim.model.SensorSonoro;
import com.sim.model.SensorTemperatura;
import com.sim.repository.SensorRepository;

@Service
public class SensorService {

    @Autowired
    private SensorRepository repo;

    @Autowired
    private PosteService posteService;

    @Autowired
    NotificacoesService notificacoesService;

    private Random rand = new Random();

    @Scheduled(fixedRate = 1000 * 60)
    public void generateRandomNotification() {
        List<Sensor> lista = this.findAll();
        if (lista.size() > 0) {
            Sensor s = lista.get(rand.nextInt(lista.size()));
            System.out.println(s.getClass());
            if (s != null) {
                s.setValue(rand.nextInt(100001));
                notificacoesService.generateNotificacao("Sensor " + s.getId() +
                        " mudou seu valor para : " + s.getValue());
                this.save(s);
            }
        }
    }

    public Sensor findById(String poste) throws NotFoundException {
        return this.repo.findById(poste).orElseThrow(() -> new NotFoundException("Sensor não encontrado"));
    }

    public List<Sensor> findAll() {
        return repo.findAll();
    }

    public Sensor save(Sensor sensor) {
        return this.repo.save(sensor);
    }

    public Sensor save(SensorHumidadeCreate sensor) throws NotFoundException {
        Poste p = this.posteService.findById(sensor.getPoste());
        return this.repo.save(new SensorHumidade(p, sensor.getAcionamento()));
    }

    public Sensor save(SensorLuzCreate sensor) throws NotFoundException {
        Poste p = this.posteService.findById(sensor.getPoste());
        return this.repo.save(new SensorLuz(p, sensor.getLuminosidade()));
    }

    public Sensor save(SensorPresencaCreate sensor) throws NotFoundException {
        Poste p = this.posteService.findById(sensor.getPoste());
        return this.repo.save(new SensorPresenca(p, sensor.getAcionamento()));
    }

    public Sensor save(SensorSonoroCreate sensor) throws NotFoundException {
        Poste p = this.posteService.findById(sensor.getPoste());
        return this.repo.save(new SensorSonoro(p, sensor.getIntensidade()));
    }

    public Sensor save(SensorTemperaturaCreate sensor) throws NotFoundException {
        Poste p = this.posteService.findById(sensor.getPoste());
        return this.repo.save(new SensorTemperatura(p, sensor.getTemperatura()));
    }

}
