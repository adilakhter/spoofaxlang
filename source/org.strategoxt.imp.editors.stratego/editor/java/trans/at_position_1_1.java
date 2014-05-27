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

@SuppressWarnings("all") public class at_position_1_1 extends Strategy 
{ 
  public static at_position_1_1 instance = new at_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4345, IStrategoTerm c_4345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_position_1_1");
    Fail21478:
    { 
      IStrategoTerm term11595 = term;
      Success11526:
      { 
        Fail21479:
        { 
          IStrategoTerm g_4205 = null;
          TermReference h_4205 = new TermReference();
          IStrategoTerm i_4205 = null;
          IStrategoTerm j_4205 = null;
          IStrategoTerm m_4205 = null;
          IStrategoTerm o_4205 = null;
          IStrategoTerm p_4205 = null;
          IStrategoTerm cons535 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          g_4205 = cons535;
          IStrategoTerm args19 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          j_4205 = args19;
          m_4205 = term;
          term = c_4345;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail21479;
          i_4205 = ((IStrategoList)term).head();
          if(h_4205.value == null)
            h_4205.value = ((IStrategoList)term).tail();
          else
            if(h_4205.value != ((IStrategoList)term).tail() && !h_4205.value.match(((IStrategoList)term).tail()))
              break Fail21479;
          term = m_4205;
          p_4205 = term;
          term = termFactory.makeTuple(i_4205, j_4205);
          lifted6551 lifted65510 = new lifted6551();
          lifted65510.b_4345 = b_4345;
          lifted65510.h_4205 = h_4205;
          term = at_index_1_0.instance.invoke(context, term, lifted65510);
          if(term == null)
            break Fail21479;
          o_4205 = term;
          term = p_4205;
          IStrategoTerm mkterm7;
          mkterm7 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{g_4205, o_4205});
          if(mkterm7 == null)
            break Fail21479;
          term = mkterm7;
          if(true)
            break Success11526;
        }
        term = term11595;
        IStrategoTerm b_4205 = null;
        b_4205 = term;
        term = c_4345;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail21478;
        term = b_4345.invoke(context, b_4205);
        if(term == null)
          break Fail21478;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}