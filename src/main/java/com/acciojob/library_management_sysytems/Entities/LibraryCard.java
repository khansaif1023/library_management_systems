package com.acciojob.library_management_sysytems.Entities;

import com.acciojob.library_management_sysytems.CardStatus;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Entity
@Table(name="card_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;
    private CardStatus cardStatus;
    private int noOfBooksIssued;
    private Data validity;
}
