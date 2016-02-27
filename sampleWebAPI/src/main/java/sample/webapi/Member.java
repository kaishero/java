package sample.webapi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/member")
public class Member {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MemberInfo> getMethod() {
        List<MemberInfo> memberList = new ArrayList<>();

        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setMemberId("1");
        memberInfo.setMemberName("test");
        memberInfo.setEntryDate(
                ParseDate.parseDateToString(
                new Date()));

        memberList.add(memberInfo);

        return memberList;
    }
}
