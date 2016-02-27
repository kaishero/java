/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.webapi;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author supervisor
 */
@Data
public class MemberInfo {

    private String memberId;
    private String memberName;
    private Date entryDate;

    public MemberInfo() {
    }
}
