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

@SuppressWarnings("all") public class parse_spoofaxconfiguration_file_0_0 extends Strategy 
{ 
  public static parse_spoofaxconfiguration_file_0_0 instance = new parse_spoofaxconfiguration_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_spoofaxconfiguration_file_0_0");
    Fail87642:
    { 
      IStrategoTerm h_17563 = null;
      IStrategoTerm i_17563 = null;
      h_17563 = term;
      i_17563 = trans.constSpoofaxConfigurationTbl;
      term = parse_file_2_1.instance.invoke(context, h_17563, strsglr_perror_0_0.instance, strsglr_report_parse_error_0_0.instance, i_17563);
      if(term == null)
        break Fail87642;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}