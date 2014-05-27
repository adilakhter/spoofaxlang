package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_spoofaxconfiguration_stream_0_0 extends Strategy 
{ 
  public static parse_spoofaxconfiguration_stream_0_0 instance = new parse_spoofaxconfiguration_stream_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_spoofaxconfiguration_stream_0_0");
    Fail22838:
    { 
      IStrategoTerm s_4619 = null;
      IStrategoTerm t_4619 = null;
      s_4619 = term;
      t_4619 = trans.constSpoofaxConfigurationTbl1;
      term = parse_stream_1_1.instance.invoke(context, s_4619, strsglr_report_parse_error_0_0.instance, t_4619);
      if(term == null)
        break Fail22838;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}