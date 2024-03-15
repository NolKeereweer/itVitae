package PasswordValidator;

class SecondPasswordValidator extends FirstPasswordValidator{
  private boolean hasT(String password) {
    return !password.contains("T");
  }

  private boolean hasAmpersand(String password) {
    return !password.contains("&");
  }

  @Override
  public boolean isValid(String password) {
    return super.isValid(password) && hasT(password) && hasAmpersand(password);
  }
}