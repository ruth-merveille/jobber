package com.postgresql.jobber.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import  java.io.Serializable;
import java.time.Instant;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
//import  java.util.Date;
import jakarta.persistence.Id;
import jakarta.persistence.EntityListeners;
import  jakarta.persistence.MappedSuperclass;
//import com.fasterxml.jackson.core.SerializableString;
import  lombok.Data;
import org.apache.logging.log4j.CloseableThreadContext;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)


public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @CreatedDate
    @Column(name = "creationDate", nullable = false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name = "lastModifiedDate")
    @JsonIgnore
    private Instant lastUpdateDte;

}
