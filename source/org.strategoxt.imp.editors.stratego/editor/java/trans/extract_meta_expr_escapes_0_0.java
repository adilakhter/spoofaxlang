package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class extract_meta_expr_escapes_0_0 extends Strategy 
{ 
  public static extract_meta_expr_escapes_0_0 instance = new extract_meta_expr_escapes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("extract_meta_expr_escapes_0_0");
    Fail23003:
    { 
      IStrategoTerm w_4763 = null;
      IStrategoTerm x_4763 = null;
      IStrategoTerm c_4764 = null;
      w_4763 = term;
      c_4764 = term;
      IStrategoTerm term12339 = term;
      Success12270:
      { 
        Fail23004:
        { 
          term = collect_om_2_0.instance.invoke(context, w_4763, lifted6837.instance, conc_0_0.instance);
          if(term == null)
            break Fail23004;
          x_4763 = term;
          if(true)
            break Success12270;
        }
        term = term12339;
        IStrategoTerm a_4764 = null;
        IStrategoTerm b_4764 = null;
        IStrategoTerm e_4764 = null;
        a_4764 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23003;
        b_4764 = term;
        e_4764 = a_4764;
        term = report_with_failure_0_2.instance.invoke(context, e_4764, trans.const4550, b_4764);
        if(term == null)
          break Fail23003;
      }
      term = c_4764;
      if(x_4763 == null)
        break Fail23003;
      term = x_4763;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}