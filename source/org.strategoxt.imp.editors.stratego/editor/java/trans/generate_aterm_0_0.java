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

@SuppressWarnings("all") public class generate_aterm_0_0 extends Strategy 
{ 
  public static generate_aterm_0_0 instance = new generate_aterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_aterm_0_0");
    Fail21872:
    { 
      IStrategoTerm t_4272 = null;
      IStrategoTerm u_4272 = null;
      IStrategoTerm v_4272 = null;
      IStrategoTerm w_4272 = null;
      IStrategoTerm z_4272 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail21872;
      v_4272 = term.getSubterm(0);
      t_4272 = term.getSubterm(3);
      z_4272 = term;
      IStrategoTerm term11977 = term;
      Success11847:
      { 
        Fail21873:
        { 
          IStrategoTerm b_4273 = null;
          b_4273 = t_4272;
          term = guarantee_extension_0_1.instance.invoke(context, b_4273, trans.const4453);
          if(term == null)
            break Fail21873;
          u_4272 = term;
          term = v_4272;
          w_4272 = v_4272;
          if(true)
            break Success11847;
        }
        term = term11977;
        IStrategoTerm x_4272 = null;
        IStrategoTerm y_4272 = null;
        IStrategoTerm d_4273 = null;
        x_4272 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21872;
        y_4272 = term;
        d_4273 = x_4272;
        term = report_with_failure_0_2.instance.invoke(context, d_4273, trans.const4454, y_4272);
        if(term == null)
          break Fail21872;
      }
      term = z_4272;
      if(u_4272 == null || w_4272 == null)
        break Fail21872;
      term = termFactory.makeTuple(u_4272, w_4272);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}