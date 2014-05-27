package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class inj2prodrule_0_0 extends Strategy 
{ 
  public static inj2prodrule_0_0 instance = new inj2prodrule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("inj2prodrule_0_0");
    Fail25617:
    { 
      IStrategoTerm term10138 = term;
      Success10105:
      { 
        Fail25618:
        { 
          IStrategoTerm z_4241 = null;
          IStrategoTerm a_4242 = null;
          IStrategoTerm b_4242 = null;
          IStrategoTerm c_4242 = null;
          if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
            break Fail25618;
          IStrategoTerm arg6041 = term.getSubterm(0);
          if(arg6041.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6041).isEmpty())
            break Fail25618;
          a_4242 = ((IStrategoList)arg6041).head();
          IStrategoTerm arg6042 = ((IStrategoList)arg6041).tail();
          if(arg6042.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6042).isEmpty())
            break Fail25618;
          c_4242 = term.getSubterm(1);
          IStrategoTerm arg6043 = term.getSubterm(2);
          if(arg6043.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)arg6043).getConstructor())
            break Fail25618;
          z_4241 = arg6043.getSubterm(0);
          IStrategoTerm term10139 = term;
          Success10106:
          { 
            Fail25619:
            { 
              term = get_cnstr_name_0_0.instance.invoke(context, z_4241);
              if(term == null)
                break Fail25619;
              { 
                if(true)
                  break Fail25618;
                if(true)
                  break Success10106;
              }
            }
            term = term10139;
          }
          term = sym2tree_0_0.instance.invoke(context, a_4242);
          if(term == null)
            break Fail25618;
          b_4242 = term;
          term = sym2nonterm_0_0.instance.invoke(context, c_4242);
          if(term == null)
            break Fail25618;
          term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{term, (IStrategoTerm)termFactory.makeListCons(b_4242, (IStrategoList)generator.constNil7)});
          if(true)
            break Success10105;
        }
        term = term10138;
        TermReference t_4241 = new TermReference();
        IStrategoTerm u_4241 = null;
        IStrategoTerm v_4241 = null;
        IStrategoTerm w_4241 = null;
        IStrategoTerm x_4241 = null;
        IStrategoTerm y_4241 = null;
        if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
          break Fail25617;
        v_4241 = term.getSubterm(0);
        IStrategoTerm arg6044 = term.getSubterm(1);
        if(arg6044.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6044).getConstructor())
          break Fail25617;
        x_4241 = arg6044.getSubterm(0);
        IStrategoTerm arg6045 = term.getSubterm(2);
        if(arg6045.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)arg6045).getConstructor())
          break Fail25617;
        u_4241 = arg6045.getSubterm(0);
        term = x_4241;
        IStrategoTerm term10140 = term;
        Success10107:
        { 
          Fail25620:
          { 
            lifted9157 lifted91570 = new lifted9157();
            lifted91570.t_4241 = t_4241;
            term = sort_1_0.instance.invoke(context, term, lifted91570);
            if(term == null)
              break Fail25620;
            if(true)
              break Success10107;
          }
          term = term10140;
          lifted9158 lifted91580 = new lifted9158();
          lifted91580.t_4241 = t_4241;
          term = parameterized_sort_2_0.instance.invoke(context, term, lifted91580, _Id.instance);
          if(term == null)
            break Fail25617;
        }
        y_4241 = term;
        term = contains_bracket_0_0.instance.invoke(context, u_4241);
        if(term == null)
          break Fail25617;
        term = u_4241;
        IStrategoTerm term10141 = term;
        Success10108:
        { 
          Fail25621:
          { 
            term = get_cnstr_name_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25621;
            { 
              if(true)
                break Fail25617;
              if(true)
                break Success10108;
            }
          }
          term = term10141;
        }
        term = syms2trees_0_0.instance.invoke(context, v_4241);
        if(term == null)
          break Fail25617;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail25617;
        IStrategoTerm arg6046 = ((IStrategoList)term).head();
        if(arg6046.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg6046).getConstructor())
          break Fail25617;
        w_4241 = arg6046.getSubterm(0);
        IStrategoTerm arg6047 = ((IStrategoList)term).tail();
        if(arg6047.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6047).isEmpty())
          break Fail25617;
        term = y_4241;
        if(t_4241.value == null)
          break Fail25617;
        term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{t_4241.value}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consRef_1, new IStrategoTerm[]{w_4241}), (IStrategoList)generator.constNil7)});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}