package pn.cv.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pn.cv.server.enumeration.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Server {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;
    @Column(unique = true)
    @NotEmpty(message = "O endereço IP não pode estar vazio ou nulo")
    private String ipAddress;
    private  String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}