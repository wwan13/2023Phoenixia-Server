package com.Fepe.PhoenixiaServer.club;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Club {

    @Id
    @GeneratedValue()
    private Integer id;
    private Integer number;
    private String category;
    private String imageUrl;
    private String name;
    private String description;
}
