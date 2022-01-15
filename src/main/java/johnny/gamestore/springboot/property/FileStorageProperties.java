package johnny.gamestore.springboot.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    public String getUploadDir() {
        if (uploadDir == null) {
            return uploadDir;
        }
        return uploadDir.replaceAll("\"", ""); // remove double quotes in case that complex path is specified with double quotes
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}
