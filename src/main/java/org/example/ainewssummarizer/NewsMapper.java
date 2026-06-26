import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

// fields that are not necessary for the request are simply ignored (i.e: dateCreated, dateUpdated...)
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface NewsMapper {


    NewsMapper INSTANCE = Mappers.getMapper(NewsMapper.class);

    // FOR POST (returns Client for the save function -> post saves everything in the database)
    Client toEntity(CreateClientDTO clientDto);

    // For GET (returns DTO to present necessary information)
    @Mapping(target = "id", source = "clientID")
    ReturnClientDTO toDto(Client client);

    // For PUT
    @Mapping(target = "clientID", ignore = true)
    void updateEntity(UpdateClientDTO dto, @MappingTarget Client client);

}
