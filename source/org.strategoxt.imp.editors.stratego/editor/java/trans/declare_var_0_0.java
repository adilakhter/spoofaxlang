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

@SuppressWarnings("all") public class declare_var_0_0 extends Strategy 
{ 
  public static declare_var_0_0 instance = new declare_var_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_var_0_0");
    Fail21731:
    { 
      IStrategoTerm a_4253 = null;
      IStrategoTerm b_4253 = null;
      IStrategoTerm e_4253 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail21731;
      a_4253 = term.getSubterm(0);
      e_4253 = term;
      IStrategoTerm term11826 = term;
      Success11723:
      { 
        Fail21732:
        { 
          term = declare_definition_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21732;
          term = termFactory.annotateTerm(a_4253, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          b_4253 = term;
          if(true)
            break Success11723;
        }
        term = term11826;
        IStrategoTerm c_4253 = null;
        IStrategoTerm d_4253 = null;
        IStrategoTerm i_4253 = null;
        c_4253 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21731;
        d_4253 = term;
        i_4253 = c_4253;
        term = report_with_failure_0_2.instance.invoke(context, i_4253, trans.const4400, d_4253);
        if(term == null)
          break Fail21731;
      }
      term = e_4253;
      if(b_4253 == null)
        break Fail21731;
      term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{b_4253});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}