package timetogeter.context.auth.application.exception;

import timetogeter.global.interceptor.response.error.CustomException;
import timetogeter.global.interceptor.response.error.status.BaseErrorCode;

public class InvalidProviderException extends CustomException {
    public InvalidProviderException(String log) {
        super(BaseErrorCode.INVALID_PROVIDER, log);
    }
}
