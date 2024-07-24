package productservicepro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import productservicepro.controller.CartController;
import productservicepro.dto.ExceptionResponseDTO;

@ControllerAdvice(basePackageClasses = CartController.class)
public class CartControllerExceptionHandler {
    @ExceptionHandler(CartNotFoundException.class)
    public ResponseEntity handleCartNotFoundException(CartNotFoundException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(pe.getMessage(),404);
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }
}
