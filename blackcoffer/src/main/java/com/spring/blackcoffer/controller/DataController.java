package com.spring.blackcoffer.controller;

import com.spring.blackcoffer.model.YourModel;
import com.spring.blackcoffer.repository.YourModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    private YourModelRepository repository;

    @GetMapping
    public ResponseEntity<List<YourModel>> getAllData() {
        try {
            List<YourModel> data = repository.findAll();
            return new ResponseEntity<>(data, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<YourModel> getDataById(@PathVariable String id) {
        try {
            Optional<YourModel> data = repository.findById(id);
            return data.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<YourModel> createData(@RequestBody YourModel data) {
        try {
            YourModel newData = repository.save(data);
            return new ResponseEntity<>(newData, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteData(@PathVariable String id) {
        try {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<YourModel> updateData(@PathVariable String id, @RequestBody YourModel updatedData) {
        try {
            Optional<YourModel> existingData = repository.findById(id);
            if (existingData.isPresent()) {
                YourModel data = existingData.get();
                // Update fields
                data.setEndYear(updatedData.getEndYear());
                data.setCityLng(updatedData.getCityLng());
                data.setCityLat(updatedData.getCityLat());
                data.setIntensity(updatedData.getIntensity());
                data.setSector(updatedData.getSector());
                data.setTopic(updatedData.getTopic());
                data.setInsight(updatedData.getInsight());
                data.setSwot(updatedData.getSwot());
                data.setUrl(updatedData.getUrl());
                data.setRegion(updatedData.getRegion());
                data.setStartYear(updatedData.getStartYear());
                data.setImpact(updatedData.getImpact());
                data.setAdded(updatedData.getAdded());
                data.setPublished(updatedData.getPublished());
                data.setCity(updatedData.getCity());
                data.setCountry(updatedData.getCountry());
                data.setRelevance(updatedData.getRelevance());
                data.setPestle(updatedData.getPestle());
                data.setSource(updatedData.getSource());
                data.setTitle(updatedData.getTitle());
                data.setLikelihood(updatedData.getLikelihood());
                // Update other fields as necessary
                YourModel savedData = repository.save(data);
                return new ResponseEntity<>(savedData, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
