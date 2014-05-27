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

@SuppressWarnings("all") public class rename_refactoring_0_0 extends Strategy 
{ 
  public static rename_refactoring_0_0 instance = new rename_refactoring_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("rename_refactoring_0_0");
    Fail21385:
    { 
      IStrategoTerm c_4189 = null;
      IStrategoTerm d_4189 = null;
      IStrategoTerm e_4189 = null;
      IStrategoTerm f_4189 = null;
      IStrategoTerm g_4189 = null;
      IStrategoTerm h_4189 = null;
      IStrategoTerm i_4189 = null;
      IStrategoTerm j_4189 = null;
      IStrategoTerm k_4189 = null;
      IStrategoTerm l_4189 = null;
      IStrategoTerm n_4189 = null;
      IStrategoTerm o_4189 = null;
      IStrategoTerm t_4189 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
        break Fail21385;
      d_4189 = term.getSubterm(0);
      IStrategoTerm arg7664 = term.getSubterm(1);
      c_4189 = arg7664;
      IStrategoList annos676 = arg7664.getAnnotations();
      if(annos676.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos676).isEmpty())
        break Fail21385;
      k_4189 = ((IStrategoList)annos676).head();
      IStrategoTerm arg7665 = ((IStrategoList)annos676).tail();
      if(arg7665.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7665).isEmpty())
        break Fail21385;
      f_4189 = term.getSubterm(3);
      e_4189 = term.getSubterm(4);
      term = termFactory.makeTuple(termFactory.annotateTerm(c_4189, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(k_4189, (IStrategoList)trans.constNil3))), d_4189);
      term = get_dependend_renamings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21385;
      g_4189 = term;
      Success11473:
      { 
        Fail21386:
        { 
          IStrategoTerm p_4189 = null;
          p_4189 = term;
          term = e_4189;
          IStrategoTerm term11509 = term;
          Success11474:
          { 
            Fail21387:
            { 
              IStrategoTerm s_4189 = null;
              s_4189 = term;
              term = has_extension_0_1.instance.invoke(context, s_4189, trans.const4289);
              if(term == null)
                break Fail21387;
              { 
                if(true)
                  break Fail21386;
                if(true)
                  break Success11474;
              }
            }
            term = term11509;
          }
          term = p_4189;
          { 
            term = termFactory.makeTuple(k_4189, g_4189, f_4189);
            term = get_asts_affected_by_renaming_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21385;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail21385;
            h_4189 = term.getSubterm(0);
            l_4189 = term.getSubterm(1);
            if(true)
              break Success11473;
          }
        }
        term = (IStrategoTerm)termFactory.makeListCons(f_4189, (IStrategoList)trans.constNil3);
        h_4189 = term;
        l_4189 = trans.constNil3;
        term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(f_4189, (IStrategoList)trans.constNil3), trans.constNil3);
      }
      term = apply_rename_refactoring_2_1.instance.invoke(context, h_4189, re_analyse_names_0_0.instance, collect_semantic_issues_0_0.instance, g_4189);
      if(term == null)
        break Fail21385;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21385;
      i_4189 = term.getSubterm(0);
      n_4189 = term.getSubterm(1);
      j_4189 = term.getSubterm(2);
      term = external_declaration_errors_0_0.instance.invoke(context, k_4189);
      if(term == null)
        break Fail21385;
      term = (IStrategoTerm)termFactory.makeListCons(l_4189, termFactory.makeListCons(term, termFactory.makeListCons(n_4189, (IStrategoList)trans.constNil3)));
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21385;
      o_4189 = term;
      term = make_set_0_0.instance.invoke(context, o_4189);
      if(term == null)
        break Fail21385;
      t_4189 = term;
      term = make_set_0_0.instance.invoke(context, j_4189);
      if(term == null)
        break Fail21385;
      term = termFactory.makeTuple(i_4189, trans.constNil3, t_4189, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}