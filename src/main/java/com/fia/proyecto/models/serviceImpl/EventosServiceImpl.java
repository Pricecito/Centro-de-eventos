
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.EventosDAO;
import com.fia.proyecto.models.entity.Eventos;
import com.fia.proyecto.models.service.IService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author JM Gutierrez
 */
@Service
public class EventosServiceImpl implements IService<Eventos> {
    @Autowired
    private EventosDAO eventosDAO;

    public List<Eventos> findAll() {
        return (List<Eventos>) eventosDAO.findAll();
    }

    public Optional<Eventos> findOne(Long id) {
        return eventosDAO.findById(id);
    }

    public Eventos saveOrUpdate(Eventos eventos) {
        return eventosDAO.save(eventos);
    }

    public void delete(Long id) {
        eventosDAO.deleteById(id);
    }

}
