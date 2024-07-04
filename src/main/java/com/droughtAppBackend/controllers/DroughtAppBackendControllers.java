.droughtappbackend.models.DroughtData;
.droughtappbackend.services.DroughtDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/drought-data")
public class DroughtAppBackendControllers {

    @Autowired
    private DroughtDataService service;

    // CREATE: POST
    @PostMapping
    public ResponseEntity<DroughtData> createData(@RequestBody DroughtData data) {
        try {
            DroughtData newData = service.createData(data);
            return new ResponseEntity<>(newData, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}