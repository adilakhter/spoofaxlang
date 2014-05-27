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

@SuppressWarnings("all") public class at_position_1_1 extends Strategy 
{ 
  public static at_position_1_1 instance = new at_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_17590, IStrategoTerm f_17590)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_position_1_1");
    Fail87694:
    { 
      IStrategoTerm term47305 = term;
      Success47282:
      { 
        Fail87695:
        { 
          IStrategoTerm i_17571 = null;
          TermReference j_17571 = new TermReference();
          IStrategoTerm k_17571 = null;
          IStrategoTerm l_17571 = null;
          IStrategoTerm o_17571 = null;
          IStrategoTerm q_17571 = null;
          IStrategoTerm r_17571 = null;
          IStrategoTerm cons2009 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          i_17571 = cons2009;
          IStrategoTerm args55 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          l_17571 = args55;
          o_17571 = term;
          term = f_17590;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail87695;
          k_17571 = ((IStrategoList)term).head();
          if(j_17571.value == null)
            j_17571.value = ((IStrategoList)term).tail();
          else
            if(j_17571.value != ((IStrategoList)term).tail() && !j_17571.value.match(((IStrategoList)term).tail()))
              break Fail87695;
          term = o_17571;
          r_17571 = term;
          term = termFactory.makeTuple(k_17571, l_17571);
          lifted24760 lifted247600 = new lifted24760();
          lifted247600.e_17590 = e_17590;
          lifted247600.j_17571 = j_17571;
          term = at_index_1_0.instance.invoke(context, term, lifted247600);
          if(term == null)
            break Fail87695;
          q_17571 = term;
          term = r_17571;
          IStrategoTerm mkterm18;
          mkterm18 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{i_17571, q_17571});
          if(mkterm18 == null)
            break Fail87695;
          term = mkterm18;
          if(true)
            break Success47282;
        }
        term = term47305;
        IStrategoTerm d_17571 = null;
        d_17571 = term;
        term = f_17590;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail87694;
        term = e_17590.invoke(context, d_17571);
        if(term == null)
          break Fail87694;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}