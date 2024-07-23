package com.bod.bod.user.service;

import com.bod.bod.user.entity.User;
import com.bod.bod.user.entity.RefreshToken;
import java.time.LocalDateTime;
import org.springframework.transaction.annotation.Transactional;

public interface RefreshTokenService {

	@Transactional
	RefreshToken createOrUpdateRefreshToken(User user, String token, LocalDateTime expirationAt);

	void deleteByToken(String token);

	void deleteByUserId(Long userId);
}