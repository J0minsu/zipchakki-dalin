package me.msjo.land.domain.land.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicUpdate;

/**
 * packageName    : me.msjo.land.domain.land.entity
 * fileName       : Officetel
 * author         : ms.jo
 * date           : 2024/06/05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024/06/05        ms.jo       최초 생성
 */
@Entity
@Getter
@DynamicUpdate
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@ToString(exclude = "hospital")
@Comment("오피스텔")
public class Officetel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long seq;

}
