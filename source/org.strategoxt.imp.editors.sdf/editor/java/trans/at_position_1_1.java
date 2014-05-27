package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class at_position_1_1 extends Strategy 
{ 
  public static at_position_1_1 instance = new at_position_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_92110, IStrategoTerm a_92111)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("at_position_1_1");
    Fail75698:
    { 
      IStrategoTerm term41463 = term;
      Success41449:
      { 
        Fail75699:
        { 
          IStrategoTerm r_92023 = null;
          TermReference s_92023 = new TermReference();
          IStrategoTerm t_92023 = null;
          IStrategoTerm u_92023 = null;
          IStrategoTerm x_92023 = null;
          IStrategoTerm z_92023 = null;
          IStrategoTerm a_92024 = null;
          IStrategoTerm cons1773 = context.invokePrimitive("SSL_get_constructor", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          r_92023 = cons1773;
          IStrategoTerm args33 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
          u_92023 = args33;
          x_92023 = term;
          term = a_92111;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail75699;
          t_92023 = ((IStrategoList)term).head();
          if(s_92023.value == null)
            s_92023.value = ((IStrategoList)term).tail();
          else
            if(s_92023.value != ((IStrategoList)term).tail() && !s_92023.value.match(((IStrategoList)term).tail()))
              break Fail75699;
          term = x_92023;
          a_92024 = term;
          term = termFactory.makeTuple(t_92023, u_92023);
          lifted21514 lifted215140 = new lifted21514();
          lifted215140.z_92110 = z_92110;
          lifted215140.s_92023 = s_92023;
          term = at_index_1_0.instance.invoke(context, term, lifted215140);
          if(term == null)
            break Fail75699;
          z_92023 = term;
          term = a_92024;
          IStrategoTerm mkterm11;
          mkterm11 = context.invokePrimitive("SSL_mkterm", term, NO_STRATEGIES, new IStrategoTerm[]{r_92023, z_92023});
          if(mkterm11 == null)
            break Fail75699;
          term = mkterm11;
          if(true)
            break Success41449;
        }
        term = term41463;
        IStrategoTerm m_92023 = null;
        m_92023 = term;
        term = a_92111;
        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
          break Fail75698;
        term = z_92110.invoke(context, m_92023);
        if(term == null)
          break Fail75698;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}