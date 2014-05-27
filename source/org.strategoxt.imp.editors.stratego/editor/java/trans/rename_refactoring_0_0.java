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
    Fail22861:
    { 
      IStrategoTerm u_4742 = null;
      IStrategoTerm v_4742 = null;
      IStrategoTerm w_4742 = null;
      IStrategoTerm x_4742 = null;
      IStrategoTerm y_4742 = null;
      IStrategoTerm z_4742 = null;
      IStrategoTerm a_4743 = null;
      IStrategoTerm b_4743 = null;
      IStrategoTerm c_4743 = null;
      IStrategoTerm d_4743 = null;
      IStrategoTerm f_4743 = null;
      IStrategoTerm g_4743 = null;
      IStrategoTerm l_4743 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 6)
        break Fail22861;
      v_4742 = term.getSubterm(0);
      IStrategoTerm arg8131 = term.getSubterm(1);
      u_4742 = arg8131;
      IStrategoList annos704 = arg8131.getAnnotations();
      if(annos704.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos704).isEmpty())
        break Fail22861;
      c_4743 = ((IStrategoList)annos704).head();
      IStrategoTerm arg8132 = ((IStrategoList)annos704).tail();
      if(arg8132.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8132).isEmpty())
        break Fail22861;
      x_4742 = term.getSubterm(3);
      w_4742 = term.getSubterm(4);
      term = termFactory.makeTuple(termFactory.annotateTerm(u_4742, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(c_4743, (IStrategoList)trans.constNil4))), v_4742);
      term = get_dependend_renamings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22861;
      y_4742 = term;
      Success12182:
      { 
        Fail22862:
        { 
          IStrategoTerm h_4743 = null;
          h_4743 = term;
          term = w_4742;
          IStrategoTerm term12218 = term;
          Success12183:
          { 
            Fail22863:
            { 
              IStrategoTerm k_4743 = null;
              k_4743 = term;
              term = has_extension_0_1.instance.invoke(context, k_4743, trans.const4499);
              if(term == null)
                break Fail22863;
              { 
                if(true)
                  break Fail22862;
                if(true)
                  break Success12183;
              }
            }
            term = term12218;
          }
          term = h_4743;
          { 
            term = termFactory.makeTuple(c_4743, y_4742, x_4742);
            term = get_asts_affected_by_renaming_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22861;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail22861;
            z_4742 = term.getSubterm(0);
            d_4743 = term.getSubterm(1);
            if(true)
              break Success12182;
          }
        }
        term = (IStrategoTerm)termFactory.makeListCons(x_4742, (IStrategoList)trans.constNil4);
        z_4742 = term;
        d_4743 = trans.constNil4;
        term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(x_4742, (IStrategoList)trans.constNil4), trans.constNil4);
      }
      term = apply_rename_refactoring_2_1.instance.invoke(context, z_4742, re_analyse_names_0_0.instance, collect_semantic_issues_0_0.instance, y_4742);
      if(term == null)
        break Fail22861;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22861;
      a_4743 = term.getSubterm(0);
      f_4743 = term.getSubterm(1);
      b_4743 = term.getSubterm(2);
      term = external_declaration_errors_0_0.instance.invoke(context, c_4743);
      if(term == null)
        break Fail22861;
      term = (IStrategoTerm)termFactory.makeListCons(d_4743, termFactory.makeListCons(term, termFactory.makeListCons(f_4743, (IStrategoList)trans.constNil4)));
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22861;
      g_4743 = term;
      term = make_set_0_0.instance.invoke(context, g_4743);
      if(term == null)
        break Fail22861;
      l_4743 = term;
      term = make_set_0_0.instance.invoke(context, b_4743);
      if(term == null)
        break Fail22861;
      term = termFactory.makeTuple(a_4743, trans.constNil4, l_4743, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}