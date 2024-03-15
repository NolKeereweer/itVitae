package PasswordValidator;

class FirstPasswordValidator implements PasswordValidator {
  boolean hasUpperCase(String password) {
    return hasCharInRange(password, 'A', 'Z');
  }

  boolean hasLowerCase(String password) {
    return hasCharInRange(password, 'a', 'z');
  }

  boolean hasNumber(String password) {
    return hasCharInRange(password, '0', '9');
  }

  boolean hasCharInRange(String password, char min, char max) {
    for (char c: password.toCharArray()) {
      if (c >= min && c <= max) {
        return true;
      }
    }
    return false;
  }

  boolean lengthIsValid(String password) {
    return password.length() <= 13 && password.length() >= 6;
  }

  public boolean isValid(String password) {
    return hasUpperCase(password) && hasLowerCase(password) && hasNumber(password) && lengthIsValid(password);
  }
}
