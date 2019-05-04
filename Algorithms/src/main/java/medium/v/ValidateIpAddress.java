package medium.v;

/**
 * Created by jsong on 2019-05-03.
 *
 * @leetcode https://leetcode.com/jsong00505/
 * @github https://github.com/jsong00505/
 * @linkedin https://www.linkedin.com/in/junesongskorea/
 * @email jsong00505@gmail.com
 * @company UBER
 * @challenge Medium - Validate IP Address (https://leetcode.com/problems/validate-ip-address/)
 */
public class ValidateIpAddress {
  public String validIPAddress(String IP) {
    String[] ipv4 = IP.split("\\.");
    String[] ipv6 = IP.split("\\:");

    if (IP == null
        || "".equals(IP)
        || IP.charAt(IP.length() - 1) == '.'
        || IP.charAt(IP.length() - 1) == ':') {
      return "Neither";
    }
    if (ipv4.length == 4) {
      return validateIpv4(ipv4);
    } else if (ipv6.length == 8) {
      return validateIpv6(ipv6);
    }
    return "Neither";
  }

  private String validateIpv4(String[] ipv4) {
    for (String s : ipv4) {
      // null check
      if (s == null || "".equals(s)) {
        return "Neither";
      }

      // leading zero
      if (s.length() > 1 && s.charAt(0) == '0') {
        return "Neither";
      }

      // negative
      if (s.charAt(0) == '-') {
        return "Neither";
      }

      // over three digits
      if (s.length() > 3) {
        return "Neither";
      }

      try {
        // parse string to int
        int d = Integer.parseInt(s);

        // over 255
        if (d > 255) {
          return "Neither";
        }
      } catch (Exception e) {
        return "Neither";
      }
    }
    return "IPv4";
  }

  private String validateIpv6(String[] ipv6) {
    for (String s : ipv6) {
      // null check
      if (s == null || "".equals(s)) {
        return "Neither";
      }

      // over four digits
      if (s.length() > 4) {
        return "Neither";
      }

      // negative
      if (s.charAt(0) == '-') {
        return "Neither";
      }

      // parse hexa decimal string to decimal int
      try {
        int decimal = Integer.parseInt(s, 16);
      } catch (Exception e) {
        return "Neither";
      }
    }
    return "IPv6";
  }
}
