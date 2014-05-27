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

@SuppressWarnings("all") public class get_dependend_renamings_0_0 extends Strategy 
{ 
  public static get_dependend_renamings_0_0 instance = new get_dependend_renamings_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_dependend_renamings_0_0");
    Fail22864:
    { 
      IStrategoTerm p_4743 = null;
      TermReference q_4743 = new TermReference();
      TermReference r_4743 = new TermReference();
      TermReference s_4743 = new TermReference();
      IStrategoTerm t_4743 = null;
      IStrategoTerm u_4743 = null;
      IStrategoTerm v_4743 = null;
      IStrategoTerm w_4743 = null;
      v_4743 = term;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22864;
      p_4743 = term.getSubterm(0);
      if(s_4743.value == null)
        s_4743.value = term.getSubterm(1);
      else
        if(s_4743.value != term.getSubterm(1) && !s_4743.value.match(term.getSubterm(1)))
          break Fail22864;
      term = p_4743;
      IStrategoList annos705 = term.getAnnotations();
      if(annos705.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos705).isEmpty())
        break Fail22864;
      if(r_4743.value == null)
        r_4743.value = ((IStrategoList)annos705).head();
      else
        if(r_4743.value != ((IStrategoList)annos705).head() && !r_4743.value.match(((IStrategoList)annos705).head()))
          break Fail22864;
      IStrategoTerm arg8133 = ((IStrategoList)annos705).tail();
      if(arg8133.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8133).isEmpty())
        break Fail22864;
      Success12184:
      { 
        Fail22865:
        { 
          IStrategoTerm x_4743 = null;
          x_4743 = term;
          if(r_4743.value == null)
            break Fail22865;
          term = $Declaration_0_0.instance.invoke(context, r_4743.value);
          if(term == null)
            break Fail22865;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
            break Fail22865;
          if(q_4743.value == null)
            q_4743.value = term.getSubterm(0);
          else
            if(q_4743.value != term.getSubterm(0) && !q_4743.value.match(term.getSubterm(0)))
              break Fail22865;
          term = x_4743;
          { 
            IStrategoTerm z_4745 = null;
            IStrategoTerm a_4746 = null;
            term = prefixes_dynrules_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22864;
            lifted6795 lifted67950 = new lifted6795();
            lifted67950.q_4743 = q_4743;
            lifted67950.r_4743 = r_4743;
            term = map_1_0.instance.invoke(context, term, lifted67950);
            if(term == null)
              break Fail22864;
            t_4743 = term;
            term = prefixes_dynrules_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22864;
            lifted6796 lifted67960 = new lifted6796();
            lifted67960.s_4743 = s_4743;
            lifted67960.r_4743 = r_4743;
            term = map_1_0.instance.invoke(context, term, lifted67960);
            if(term == null)
              break Fail22864;
            u_4743 = term;
            a_4746 = term;
            term = termFactory.makeTuple(t_4743, u_4743);
            term = zip_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22864;
            z_4745 = term;
            term = a_4746;
            if(q_4743.value == null || (r_4743.value == null || s_4743.value == null))
              break Fail22864;
            IStrategoList list194;
            list194 = checkListTail(z_4745);
            if(list194 == null)
              break Fail22864;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(termFactory.annotateTerm(q_4743.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(r_4743.value, (IStrategoList)trans.constNil4))), s_4743.value), list194);
            w_4743 = term;
            if(true)
              break Success12184;
          }
        }
        term = (IStrategoTerm)termFactory.makeListCons(v_4743, (IStrategoList)trans.constNil4);
        w_4743 = term;
      }
      term = w_4743;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}