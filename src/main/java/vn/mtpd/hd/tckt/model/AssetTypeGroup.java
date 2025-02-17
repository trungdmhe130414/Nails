package vn.mtpd.hd.tckt.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "AssetTypeGroups")
@ToString
public class AssetTypeGroup implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "assetTypeGroupID")
    private Integer assetTypeGroupID;

    @Column(name = "groupName")
    private String groupName;
}
