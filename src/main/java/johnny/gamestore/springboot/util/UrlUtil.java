package johnny.gamestore.springboot.util;

import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

public class UrlUtil {
  private static final int DEFAULT_PORT = 80;

  public static String getBaseEnvLinkURL() {
    String baseEnvLinkURL = null;
    HttpServletRequest currentRequest =
        ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
    baseEnvLinkURL = "http://" + currentRequest.getLocalName();
    if (currentRequest.getLocalPort() != DEFAULT_PORT) {
      baseEnvLinkURL += ":" + currentRequest.getLocalPort();
    }
    if (StringUtils.hasText(currentRequest.getContextPath())) {
      baseEnvLinkURL += currentRequest.getContextPath();
    }

    return baseEnvLinkURL;
  }
}
