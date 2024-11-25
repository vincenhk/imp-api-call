package co.imp.tech.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pageable-api", url = "${url.pageable.api}")
public interface AddressClient {
    @GetMapping("/Document/request-monitor/{size}/{page}")
    public ResponseEntity<?> requestMonitor(@PathVariable int size, @PathVariable int page);
}
