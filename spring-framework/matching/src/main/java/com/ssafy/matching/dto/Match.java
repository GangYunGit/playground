package com.ssafy.matching.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@SuppressWarnings("serial")
@Entity
@Table(name = "`match`")
@ApiModel(value = "Match : 팀 경기 정보", description = "팀의 경기 정보를 나타낸다.")
public class Match implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "경기 번호")
    private int matchId;
//    @ApiModelProperty(value = "장소 번호")
//    private int placeId;
    @ApiModelProperty(value = "경기 날짜", required = true)
    private String matchDate;
    @ApiModelProperty(value = "경기 선호 최소 시작 시간", required = true)
    private String minStartTime;
    @ApiModelProperty(value = "경기 선호 최대 시작 시간", required = true)
    private String maxStartTime;
    @ApiModelProperty(value = "선호 지역의 최대 반경", required = true)
    private int distance;
    @ApiModelProperty(value = "경기 결과 기록이 완료되었는지")
    private boolean isDone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "placeId")
    @ApiModelProperty(value = "경기의 선호 장소", required = true)
    private PreferredPlace preferredPlace;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "matchId")
    private List<TeamMatchResult> teamMatchResultList = new ArrayList<>();
}
