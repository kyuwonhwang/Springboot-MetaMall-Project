package shop.mtcoding.metamall.dto.user;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.metamall.model.user.User;
import shop.mtcoding.metamall.util.MyDateUtil;

public class UserResponse {
    @Getter @Setter
    public static class LoginDto {
        private Long id;
        private String username;
        private String role;
        private String updatedAt;

        public LoginDto(User user) {
            this.id = user.getId();
            this.username = user.getUsername();
            this.role = user.getRole();
            this.updatedAt = MyDateUtil.toStringFormat(user.getUpdatedAt());
        }
    }
}