package ifsul.agileproject.rachadinha.service;

import java.util.List;
import java.util.Optional;

import ifsul.agileproject.rachadinha.domain.dto.RachaDTO;
import ifsul.agileproject.rachadinha.domain.dto.RachaRegisterDTO;
import ifsul.agileproject.rachadinha.domain.dto.RachaUpdateDTO;
import ifsul.agileproject.rachadinha.domain.entity.Racha;
import ifsul.agileproject.rachadinha.domain.entity.Status;
import ifsul.agileproject.rachadinha.domain.entity.User;

public interface RachaService {

	Racha saveRacha(RachaRegisterDTO rachaDTO);

	Optional<Racha> findRachaById(Long id);

	void deleteRachaById(Long id);

	Racha updateRacha(RachaUpdateDTO rachaUpdateDTO, Racha racha);

	Racha findRachaByStatus(Status status);

	List<Racha> findRachaByOwner(User owner);

	void save(Racha racha);
}
