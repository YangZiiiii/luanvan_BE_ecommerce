package com.ecommerce.app.model.mapper;

import com.ecommerce.app.model.dao.response.dto.UserResponse;
import com.ecommerce.app.model.entity.User;
import com.ecommerce.app.repository.FavouriteRepository;
import com.ecommerce.app.utils.Enum.Role;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UserMapper {

    public static UserResponse toResponse(User user,int numberOfFavorites) {
        boolean isAdmin = user.getRole() == Role.ADMIN;
        return UserResponse.builder()
                .id(user.getId())
                .UID(user.getUID())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .avatarUrl(user.getAvatar() != null ? user.getAvatar() : null) // hoặc ẩn nếu muốn
                .email(user.getEmail())
                .phone(user.getPhone())
                .role(isAdmin ? null :user.getRole())
                .status(user.getStatus())
                .numberOfFavorites(numberOfFavorites)
                .build();
    }

    public static UserResponse toResponse(User user) {
        return toResponse(user, 0); // gán mặc định = 0 nếu không truyền vào
    }


    public static List<UserResponse> toResponseList(List<User> users) {
        return users.stream()
                .map(UserMapper::toResponse)
                .collect(Collectors.toList());
    }






}
