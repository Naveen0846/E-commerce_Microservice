package com.microservice.order.response;

public class ResponseMessage {

	private ResponseMessage() {
	}

	public static final String DEPARTMENT = "Department";
	public static final String DEPARTMENT_EXIST = "Department already exists, please enter a different department name";

	public static final String SPECIALTY = "Specialty";
	public static final String SPECIALTY_EXIST = "Specialty already exists, please enter a different Speciality name";

	public static final String EMAIL_EXIST = "Email already exists in the system";

	public static final String ROLE = "Role";
	public static final String ROLE_EXIST = "Role already exists, please enter a different role name";
//	public static final String ROLE_SAVE = "Role saved successfully";

	public static final String SPECIALTY_NOT_EXIST = "Speciality Doesn't exists";

	public static final String USER = "User";
	public static final String USER_SAVED = "User saved successfully";
	public static final String USER_NOT_SAVED = "User Not Saved";
	public static final String USER_LOGEDOUT = "User Logged Out!";
	public static final String USER_NOT_EXIST = "User Not Exist!";
	public static final String USER_DELETED = "User Deleted successfully";
	public static final String USER_UPDATED = "User details updated successfully";
	public static final String USERNAME_REQUIRED = "Username is required";
	public static final String USERNAME_NOT_EXIST = "Invalid Credentials. Please try again";
	public static final String INCORRECT_UNAME_AND_PASS = "Username or Password Incorrect!";
	public static final String TOKEN_NOT_AVAILABLE = "User Token not available!";
	public static final String USER_INACTIVE = "User is Inactive";
	public static final String USER_PASS_EXPIRED = "User password expired";

	public static final String CONDITION = "Condition";
	public static final String CONDITION_SAVE = "Condition saved successfully";
	public static final String CONDITION_UPDATED = "Condition updated successfully";
	public static final String CONDITION_NOT_EXIST = "Condition Doesn't exists";
	public static final String CONDITION_EXIST = "Condition already exists, please enter a different Condition name";

	public static final String ROLE_NOT_EXIST = "Role Doesn't exists";

	public static final String CARETEAM = "Careteam";
	public static final String CARETEAM_EXIST = "Care team already exists, please enter a different care team name";
	public static final String CARETEAM_SAVE = "Care team saved successfully";
	public static final String CARETEAM_NOT_EXIST = "Care team Doesn't exists";

	public static final String CATEGORY = "Category";
	public static final String CATEGORY_EXIST = "Category already exists, please enter a different Category name";
	public static final String CATEGORY_SAVE = "Category saved successfully";
	public static final String CATEGORY_NOT_EXIST = "Category Doesn't exists";
	public static final String CATEGORY_COLOR_EXIST = "Color already exists, please enter a different color";

	public static final String PATIENT_EXIST = "Patient already exists, please enter a different Patient Id";
	public static final String PATIENT_SAVE = "Patient saved successfully";

	public static final String FILE_UPLOADED = "File uploaded successfully";

	public static final String PASSWORD_POLICY = "Password must contain minimum 8 characters and a combination of (A-Za-z0-9) and special characters";
	public static final String INCORRECT_OLD_PASS = "Old Password Is Incorrect!";
	public static final String CURRENT_NEW_PASS_NOT_SAME = "Current and New Passwords shouldn't be same!";
	public static final String INCORRECT_NEW_PASS = "New Password Is Incorrect!";
	public static final String PASSWORD_POLICY_NOT_MATCH = "New Password Is Not Matching with Policy"
			+ "Please ensure that your password contains minimum 8 characters and combination of uppercase and lowercase letter and number are required";
	public static final String OTP_EXPIRED = "OTP Validity Expired";
	public static final String OTP_MISSING = "OTP is missing to reset password!";
	public static final String PHONE_OTP_SENT = "OTP has been sent to your phonenumber!";
	public static final String EMAIL_OTP_SENT = "OTP has been sent to your email ID!";

	public static final String VALID_OTP = "Please enter the valid OTP";
	public static final String INVALID_VALID_OTP = "Please enter the valid OTP";
	public static final String VALID_OTP_MODE = "Please select valid otp mode!";
	public static final String SUCCES_OTP = "OTP verification successfully";

	public static final String INVALID_USER = "User is not valid";

	public static final String SOMETHING_WENT_WRONG = "Something went wrong! Please try again!";
	public static final String SOMETHING_WENT_WRONG_WHILE_SETTING_PASSWORD = "Entered password can't be used";

	public static final String OTP_ACCOUNT_LOCK = "Account is locked to send OTP";
	public static final String INVALID_REQUEST = "Invalid Request, Please try again!";
	public static final String TOO_MANY_ATTEMPTS = "Too Many Attempts";
	public static final String US_PHONE_CODE = "+91";

	// Admin Response Messages
	public static final String ADMIN_CREATION_FAIED = "ADMIN COULD NOT BE CREATED, Please check ..!";
	public static final String ADMIN_CREATION_SUCCESS = "ADMIN CREATED Success";
	public static final String ADMIN_NOT_VALID = "ADMIN does not Exists with the entered Email/Password, Credentials ERROR..!";
	public static final String ADMIN_VALIDATION_SUCCESS = "ADMIN Data Fetched Successfully";

	// Email response Messages
	public static final String EMAIL_SENT_FAILED = "ADMIN CREATED Success";

	// Password response messages
	public static final String PASSWORD_CREATION_FAILED = "ERROR while saving password, Please Try again..!";
	public static final String PASSWORD_UPDATE_FAILED = "Password failed to update, Please try with other password";
	public static final String PASSWORD_UPDATED = "Password Updated successfully";

	// Token response messages
	public static final String TOKEN_SENT_FAILED = "Token sent to failed, Please try again.";
	public static final String TOKEN_SENT_SUCCESS = "Token sent Success..!,Token has been sent to your registered email ID!";
	public static final String TOKEN_VALIDATION_FAILED = "Token entered is Invalid, Please check..!";
	public static final String TOKEN_VALIDATION_SUCCESS = "Token Validated Successfully..";
	public static final String TOKEN_GENERATION_FAILED = "Token Validated Successfully..";

	// customer Response Messages
	public static final String CUSTOMER_ALDREADY_REGISTERED = "Customer exists in Database,Navigate to billing Section.. ";
	public static final String CUSTOMER_REGISTERED_SUCCESSFULLY = "Customer Registeration Successful";
	public static final String CUSTOMER_REGISTRATION_FAILED = "Customer Registeration Failed, Please Try again..!";
	public static final String CUSTOMER_DETAILS_UNAVAILABLE = "Customer Details Unavailable, Please try again..";
	public static final String CUSTOMER_DETAILS_FETCHED = "Customer Details fetched Successfully..";

	// Medicines response Messages
	public static final String MEDICINES_SAVED_SUCCESSFULLY = "Medices saved Successfully";
	public static final String MEDICINES_SAVE_FAILED = "Error while saving Medicines..!";
	public static final String MEDICINES_UPDATE_FAILED = "Medicines Update failed..!";
	public static final String MEDICINES_UPDATE_SUCCESS = "Medicines Updated Successfully";
	public static final String MEDICINES_FETCHING_FAILED = "Medicines Details coulnt be fetched,Please try Again..!";
	public static final String MEDICINES_FETCHED_SUCCESSFULLY = "Medicines Details Fetched SUCCESS..";

	// Staff response messages
	public static final String STAFF_CREATED_SUCCESSFULLY = "Staff saved Successfully";
	public static final String STAFF_CREATION_FAILED = "Failed while saving staff, Please Try again.";
	public static final String STAFF_UPDATE_SUCCESS = "Staff Details Updated Successfully..!";
	public static final String STAFF_UPDATE_FAILED = "ERROR while updating staff details, Please Check Details.";
	public static final String STAFF_DETAILS_INVALID = "Staff details does not Exists.";
	public static final String STAFF_DETAILS_FETCHED = "Staff details fecthed successfully..";

	// SALE response messages
	public static final String SALE_CREATED_SUCCESS = "SALE created Successfully.";
	public static final String SALE_CREATION_FAILED = "ERROR while creating sales details, Please Try Again";
	public static final String SALE_DETAILS_FETCHED_SUCCESS = "SALES details fetched Successfully..!";
	public static final String SALE_DETAILS_FETCHING_FAILED = "ERROR while fetching SALES details, ,Please try Again..!";

	// Supplier response messages
	public static final String SUPPLIER_CREATED_SUCCESS = "Supplier added Successfully.";
	public static final String SUPPLIER_CREATION_FAILED = "ERROR while adding supplier details, Please Try Again";
	public static final String SUPPLIER_DETAILS_FETCHED_SUCCESS = "SUPPLIER details fetched Successfully..!";
	public static final String SUPPLIER_DETAILS_FETCHING_FAILED = "ERROR while fetching SUPPLIER details, ,Please try Again..!";

	// Client response messages
	public static final String CLIENT_CREATED_SUCCESS = "client created Successfully.";
	public static final String CLIENT_CREATION_FAILED = "ERROR while creating client details, Please Try Again";
	public static final String CLIENT_DETAILS_ALDREADY_EXISTS = "Client Details aldready exists, Please try with Different Email.";
	public static final String CLIENT_DETAILS_FETCHED_SUCCESS = "Client details fetched Successfully..!";
	public static final String CLIENT_DETAILS_FETCHING_FAILED = "ERROR while fetching Client details, ,Please try Again..!";
	public static final String CLIENT_DETAILS_UPDATE_SUCCESS = "Client details Updated Successfully..!";
	public static final String CLIENT_DETAILS_UPDATE_FAILED = "Client details Updated FAILED, Please Try Again..";
	public static final String CLIENT_DETAILS_INVALID = "ERROR while fetching Client details, ,Please check Entered CRN Id ";
	public static final String CLIENT_DEACTIVATION_SUCCESS = "Client deactivated Successfully..!";
	public static final String CLIENT_DEACTIVATION_FAILED = "ERROR while Deactivating Client ,Please check Entered CRN Id ";

	// Insurance response messages
	public static final String INSURANCE_REGISTRATION_SUCCESS = "Insurance registered Successfully.";
	public static final String INSURANCE_REGISTRATION_FAILED = "ERROR while registering Insurance details, Please Try Again";
	public static final String INSURANCE_POLICY_ALDREADY_EXISTS = "Insurance Policy number Aldready exists";
	public static final String INSURANCE_POLICY_FETCHED_SUCCESS = "Insurance Policy details fetched Successfully..!";
	public static final String INSURANCE_POLICY_FETCHING_FAILED = "ERROR while fetching Insurance details, ,Please try Again..!";
	public static final String INSURANCE_POLICY_UPDATE_SUCCESS = "Insurance details Updated Successfully..!";
	public static final String INSURANCE_POLICY_UPDATE_FAILED = "Insurance details Updated FAILED, Please Try Again..";
	public static final String INSURANCE_POLICY_RENEWED_SUCCESS = "Insurance Policy Renewed Successfully..!";
	public static final String INSURANCE_POLICY_RENEWED_FAILED = "Insurance Policy Renewed FAILED, Please Try Again..";
	public static final String INSURANCE_POLICY_INVALID = "ERROR while fetching Insurance details, ,Please check Entered INS Id ";
	public static final String INSURANCE_DEACTIVATION_SUCCESS = "Insurance deactivated Successfully..!";
	public static final String INSURANCE_DEACTIVATION_FAILED = "ERROR while Deactivating Insurance Policy ,Please check Entered INS Id ";
	public static final String INSURANCE_INACTIVE = "Insurance policy has expired, Buy Policy Save Life";
	public static final String INSURANCE_ACTIVE = "Insurance policy is Active";

	// Claim response messages
	public static final String CLAIM_REGISTRATION_SUCCESS = "Claim registered Successfully.";
	public static final String CLAIM_REGISTRATION_FAILED = "ERROR while registering Claim details, Please Try Again";
	public static final String CLAIM_POLICY_FETCHED_SUCCESSFULLY = "Claim Policy details fetched Successfully..!";
	public static final String CLAIM_POLICY_FETCHING_FAILED = "ERROR while fetching Claim details, ,Please try Again..!";
	public static final String CLAIM_STATUS_ACTIVE = "Claim Details is Active";
	public static final String CLAIM_STATUS_INACTIVE = "Claim Details is InActive";
	public static final String CLAIM_DETAILS_INVALID = "Claim Details could not be found, Please check claim Number..";
	public static final String CLAIM_REJECTION_FAILED = "Claim Policy rejected FAILED, Please Try again..";
	public static final String CLAIM_REJECTION_SUCCESS = "Claim Policy rejected successfully.";

	// order response message
	public static final String ORDER_PLACED_SUCCESS = "Order placed Successfully.";
	public static final String ORDER_PLACED_FAILED = "ERROR while saving Order details, Please Try Again";
	public static final String ORDER_DETAILS_AVAILABLE = "Order details fetched Successfully..!";
	public static final String ORDER_DETAILS_FETCHED_FAILED = "ERROR while fetching Order details, ,Please try Again..!";
	public static final String ORDER_STATUS_ACTIVE = "Order Details is Active";
	public static final String ORDER_STATUS_INACTIVE = "Order Details is InActive";
	public static final String ORDER_EMAIL_SEND_FAILED = "ERROR while sending Email, Please Try Again";

	//
	public static final String PRODUCT_PLACED_SUCCESS = "Product placed Successfully.";
	public static final String PRODUCT_PLACED_FAILED = "ERROR while saving product details, Please Try Again";
	public static final String PRODUCT_DETAILS_AVAILABLE = "Product details fetched Successfully..!";
	public static final String PRODUCT_DETAILS_FETCHED_FAILED = "ERROR while fetching Product details, ,Please try Again..!";
	public static final String PRODUCT_NOT_FOUND = "product details not found, ,Please try Again..!";

	
}
