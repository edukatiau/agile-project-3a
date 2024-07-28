package ifsul.agileproject.rachadinha.domain.dto;

import ifsul.agileproject.rachadinha.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OwnerDTO {

  private Long id;
  private String name;
  private String email;

  public static OwnerDTO transformaEmDTO(User user){
    return new OwnerDTO(user.getId(), user.getName(), user.getEmail());
  }
}
