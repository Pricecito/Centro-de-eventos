
package com.fia.proyecto.models.serviceImpl;

import com.fia.proyecto.models.dao.JornadaDAO;
import com.fia.proyecto.models.entity.Jornada;
import com.fia.proyecto.models.service.IService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JornadaServiceImpl implements IService<Jornada> {
    @Autowired
    private JornadaDAO jornadaDao;

    public List<Jornada> findAll() {
        return (List<Jornada>) jornadaDao.findAll();
    }

    public Optional<Jornada> findOne(Long id) {
        return jornadaDao.findById(id);
    }

    public Jornada saveOrUpdate(Jornada jornada) {
        return jornadaDao.save(jornada);
    }

    public void delete(Long id) {
        jornadaDao.deleteById(id);
    }

}
