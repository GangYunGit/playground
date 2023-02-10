package com.websocket.chat.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class TeamMatchResult {

    @Id
    private int teamMatchResultId;
    private int teamId;
    private int matchId;
    private boolean isWin;

}
