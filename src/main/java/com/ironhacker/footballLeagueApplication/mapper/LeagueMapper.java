package com.ironhacker.footballLeagueApplication.mapper;

import com.ironhacker.footballLeagueApplication.model.League;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING) // uses = {}
public interface LeagueMapper {
    <LeagueDto> void LeagueToEntity (LeagueDto dto);
   League toDo(League entity);
}