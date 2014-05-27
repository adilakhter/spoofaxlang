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

@SuppressWarnings("all") public class open_import_1_0 extends Strategy 
{ 
  public static open_import_1_0 instance = new open_import_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4228)
  { 
    context.push("open_import_1_0");
    Fail21624:
    { 
      IStrategoTerm u_4228 = null;
      IStrategoTerm y_4228 = null;
      y_4228 = term;
      IStrategoTerm term11715 = term;
      Success11638:
      { 
        Fail21625:
        { 
          u_4228 = term;
          if(true)
            break Success11638;
        }
        term = term11715;
        IStrategoTerm v_4228 = null;
        IStrategoTerm w_4228 = null;
        IStrategoTerm c_4229 = null;
        v_4228 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21624;
        w_4228 = term;
        c_4229 = v_4228;
        term = report_with_failure_0_2.instance.invoke(context, c_4229, trans.const4369, w_4228);
        if(term == null)
          break Fail21624;
      }
      term = y_4228;
      if(u_4228 == null)
        break Fail21624;
      term = u_4228;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}