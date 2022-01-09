package ssafy.moviecurators.domain.accounts;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Curator Entity
 */
@Entity
@Table(name = "accounts_curator")
@Getter @Setter
@NoArgsConstructor
public class Curator {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="from_user_id")
    private User fromUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="to_user_id")
    private User toUser;

    private Integer score = 0;

}
