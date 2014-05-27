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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4898, IStrategoTerm u_4898)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_position_1_1");
    Fail22954:
    { 
      IStrategoTerm term12304 = term;
      Success12235:
      { 
        Fail22955:
        { 
          IStrategoTerm y_4758 = null;
          TermReference z_4758 = new TermReference();
          IStrategoTerm a_4759 = null;
          IStrategoTerm b_4759 = null;
          IStrategoTerm e_4759 = null;
          IStrategoTerm g_4759 = null;
          IStrategoTerm h_4759 = null;
          IStrategoTerm cons579 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          y_4758 = cons579;
          IStrategoTerm args32 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          b_4759 = args32;
          e_4759 = term;
          term = u_4898;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22955;
          a_4759 = ((IStrategoList)term).head();
          if(z_4758.value == null)
            z_4758.value = ((IStrategoList)term).tail();
          else
            if(z_4758.value != ((IStrategoList)term).tail() && !z_4758.value.match(((IStrategoList)term).tail()))
              break Fail22955;
          term = e_4759;
          h_4759 = term;
          term = termFactory.makeTuple(a_4759, b_4759);
          lifted6822 lifted68220 = new lifted6822();
          lifted68220.t_4898 = t_4898;
          lifted68220.z_4758 = z_4758;
          term = at_index_1_0.instance.invoke(context, term, lifted68220);
          if(term == null)
            break Fail22955;
          g_4759 = term;
          term = h_4759;
          IStrategoTerm mkterm12;
          mkterm12 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{y_4758, g_4759});
          if(mkterm12 == null)
            break Fail22955;
          term = mkterm12;
          if(true)
            break Success12235;
        }
        term = term12304;
        IStrategoTerm t_4758 = null;
        t_4758 = term;
        term = u_4898;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail22954;
        term = t_4898.invoke(context, t_4758);
        if(term == null)
          break Fail22954;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}