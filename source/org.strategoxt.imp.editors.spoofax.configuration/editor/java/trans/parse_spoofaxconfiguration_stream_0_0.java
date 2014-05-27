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
    Fail87646:
    { 
      IStrategoTerm p_17563 = null;
      IStrategoTerm q_17563 = null;
      p_17563 = term;
      q_17563 = trans.constSpoofaxConfigurationTbl1;
      term = parse_stream_1_1.instance.invoke(context, p_17563, strsglr_report_parse_error_0_0.instance, q_17563);
      if(term == null)
        break Fail87646;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}