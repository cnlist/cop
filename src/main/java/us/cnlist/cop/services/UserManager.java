package us.cnlist.cop.services;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import us.cnlist.cop.entity.BelongsToUser;
import us.cnlist.cop.entity.UserProfileEntity;
import us.cnlist.cop.repository.UserProfileRepository;

@Component
public class UserManager {
    private final UserProfileRepository userProfileRepository;

    public UserManager(UserProfileRepository userProfileRepository) {
        this.userProfileRepository = userProfileRepository;
    }

    public UserProfileEntity getProfile() {
        return userProfileRepository.findById(getLogin()).get();
    }

    public String getLogin() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
    }

    public boolean contains(BelongsToUser belongsToUser) {
        return contains(belongsToUser.getUsername());
    }

    public boolean contains(String login) {
        return getLogin().equals(login);
    }
}
