package edu.uci.ics.cs122b.test.common;

import javax.ws.rs.core.Response.Status;
import java.util.HashMap;
import java.util.Map;

public enum Result
{
    JSON_PARSE_EXCEPTION                        (-3,  "JSON parse exception", Status.BAD_REQUEST),
    JSON_MAPPING_EXCEPTION                      (-2,  "JSON mapping exception", Status.BAD_REQUEST),

    INTERNAL_SERVER_ERROR                       (-1,  "Internal server error", Status.INTERNAL_SERVER_ERROR),

    /* HW1 Result Codes*/
    STRING_SUCCESSFULLY_REVERSED                (10,  "String successfully reversed"),
    COULD_NOT_REVERSE_STRING                    (11,  "Could not reverse string"),
    STRING_IS_EMPTY                             (12,  "String is empty"),
    STRING_CONTAINS_INVALID_CHARACTERS          (13,  "String contains invalid characters"),

    CALCULATION_SUCCESSFUL                      (20,  "Calculation successful"),
    CALCULATION_UNSUCCESSFUL                    (21,  "Calculation unsuccessful"),
    DATA_CONTAINS_INVALID_INTEGERS              (22,  "Data contains invalid integers"),

    /*HW2 Result Codes*/
    PLEVEL_OUT_OF_RANGE                         (-14, "Privilege level out of valid range", Status.BAD_REQUEST),
    TOKEN_INVALID_LENGTH                        (-13, "Token has invalid length", Status.BAD_REQUEST),
    PASSWORD_INVALID_LENGTH                     (-12, "Password has invalid length", Status.BAD_REQUEST),
    EMAIL_ADDRESS_INVALID_FORMAT                (-11, "Email address has invalid format", Status.BAD_REQUEST),
    EMAIL_ADDRESS_INVALID_LENGTH                (-10, "Email address has invalid length", Status.BAD_REQUEST),
    PASSWORD_NOT_MEET_LENGTH_REQUIREMENTS       (12,  "Password does not meet length requirements"),
    PASSWORD_NOT_MEET_CHARACTER_REQUIREMENTS    (13,  "Password does not meet character requirement"),
    EMAIL_ALREADY_IN_USE                        (16,  "Email already in use"),
    USER_REGISTERED_SUCCESSFULLY                (110, "User registered successfully"),

    PASSWORD_NOT_MATCH                          (11,  "Passwords do not match"),
    USER_NOT_FOUND                              (14,  "User not found"),
    LOGGED_IN_SUCCESSFULLY                      (120, "User logged in successfully"),
    SESSION_ACTIVE                              (130, "Session is active"),
    SESSION_EXPIRED                             (131, "Session is expired"),
    SESSION_CLOSED                              (132, "Session is closed"),
    SESSION_REVOKED                             (133, "Session is revoked"),
    SESSION_NOT_FOUND                           (134, "Session not found"),
    SUFFICIENT_PRIVILEGE                        (140, "User has sufficient privilege level"),
    INSUFFICIENT_PRIVILEGE                      (141, "User has insufficient privilege level"),
	
	/*HW3 Result Codes */
	MOVIES_FOUND								(210, "Found movie(s) with search parameters."),
	MOVIES_NOT_FOUND							(211, "No movies found with search parameters."),
	PEOPLE_FOUND                                (212, "Found people with search parameters."),
    PEOPLE_NOT_FOUND                            (213, "No people found with search parameters."),
    MOVIE_ADDED                                 (214, "Movie successfully added."),
    MOVIE_NOT_ADDED                             (215, "Could not add movie."),
    MOVIE_ALREADY_EXISTS                        (216, "Movie already exists."),
    MOVIE_UPDATED                               (217, "Movie successfully updated."),
    MOVIE_NOT_UPDATED                           (218, "Could not update movie."),
    PERSON_DOES_NOT_EXIST                       (223, "Person does not exist."),
    PERSON_NOT_UPDATED                          (224, "Could not update person."),
    PERSON_UPDATED                              (225, "Person successfully updated."),
    PERSON_ALREADY_EXISTS                       (226, "Person already exists."),
    PERSON_NOT_ADDED                            (227, "Could not add person."),
    PERSON_ADDED                                (228, "Person successfully added."),
    POPULARITY_UPDATED                          (260, "Popularity successfully updated."),
    POPULAIRTY_NOT_UPDATED                      (261, "Could not update popularity.");


    private static final Map<Integer, String> CODE_MAP;

    static
    {
        CODE_MAP = new HashMap<>();

        for (Result r : Result.values())
            CODE_MAP.put(r.resultCode, r.message);
    }

    private final Integer resultCode;
    private final String  message;
    private final Status  status;

    Result(int resultCode, String message)
    {
        this.resultCode = resultCode;
        this.message = message;
        this.status = Status.OK;
    }

    Result(int resultCode, String message, Status status)
    {
        this.resultCode = resultCode;
        this.message = message;
        this.status = status;
    }

    public int getResultCode()
    {
        return resultCode;
    }

    public String getMessage()
    {
        return message;
    }

    public Integer getStatus()
    {
        return status.getStatusCode();
    }
}
