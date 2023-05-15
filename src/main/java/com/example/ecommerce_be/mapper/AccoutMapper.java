package com.example.ecommerce_be.mapper;

import com.example.ecommerce_be.dto.AccountDTO;
import com.example.ecommerce_be.dto.CustomerDTO;
import com.example.ecommerce_be.entity.Account;
import com.example.ecommerce_be.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ColorMapper.class})
public interface AccoutMapper {
    //@Mapping(target = "code",source = "productCode")
    //@Mapping(target = "name",source = "productName")
    //@Mapping(target = "colors",ignore = true)
    Account toEntity(AccountDTO accountDTO);

    //@Mapping(target = "productCode",source = "code")
    //@Mapping(target = "productName",source = "name")
    //@Mapping(target = "colors",qualifiedByName = "toColorDTO")
    AccountDTO toDto(Account account);

    List<AccountDTO> toDtos(List<Account> datas);

   // @Named(value = "toColorDTO")
    //default List<String> toColorDTO(List<Color> colorList){
       // return colorList.stream().map(item-> item.getCode()).collect(Collectors.toList());
    //}

}
