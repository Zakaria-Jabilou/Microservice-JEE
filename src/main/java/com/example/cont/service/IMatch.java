package com.example.cont.service;

import com.example.cont.doa.Match;
import com.example.cont.repos.MatchRepo;

public interface IMatch {
    public String addmatch(Match matc);
    public Match getmatch(Integer id);
}
