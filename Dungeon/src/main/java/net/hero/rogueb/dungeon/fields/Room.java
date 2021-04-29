package net.hero.rogueb.dungeon.fields;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

record Room(Coordinate2D position, Coordinate2D size){
    public List<List<String>> getDisplay(){
        return Stream.generate(() ->
                Stream.generate(() -> ".").limit(this.size.x()).collect(Collectors.toList())
        ).limit(this.size.y()).collect(Collectors.toList());
    }
 }
