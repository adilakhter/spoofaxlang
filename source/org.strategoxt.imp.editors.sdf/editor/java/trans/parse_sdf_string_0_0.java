package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_sdf_string_0_0 extends Strategy 
{ 
  public static parse_sdf_string_0_0 instance = new parse_sdf_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_sdf_string_0_0");
    Fail75648:
    { 
      IStrategoTerm u_92015 = null;
      IStrategoTerm v_92015 = null;
      u_92015 = term;
      v_92015 = trans.constSDFTbl2;
      term = parse_string_1_1.instance.invoke(context, u_92015, strsglr_report_parse_error_0_0.instance, v_92015);
      if(term == null)
        break Fail75648;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}