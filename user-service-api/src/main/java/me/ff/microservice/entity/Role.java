package me.ff.microservice.entity;

import me.ff.microservice.entity.AbstractEntity;
import me.ff.microservice.entity.UserDao;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "role",schema = "public")
public class Role extends AbstractEntity implements GrantedAuthority {

    @Column(name = "name")
    private String name;

    @Column(name = "enabled")
    private boolean enabled;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "role",fetch = FetchType.EAGER)
    private Set<UserDao> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<UserDao> getUsers() {
        return users;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", enabled=" + enabled +
                ", users=" + users +
                '}';
    }
}
